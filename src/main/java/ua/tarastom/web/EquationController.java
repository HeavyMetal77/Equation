package ua.tarastom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.tarastom.dao.EquationDAO;
import ua.tarastom.entity.EquationModel;
import ua.tarastom.service.EquationService;

import java.util.List;

@Controller
@RequestMapping("/equation")
public class EquationController {

    @Autowired
    EquationDAO equationDAO;
    @Autowired
    EquationService equationService;

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model theModel) {
        EquationModel equationModel = new EquationModel();
        theModel.addAttribute("inputData", equationModel);
        return "inputData";
    }

    @RequestMapping(value = "/processForm" , method = RequestMethod.POST)
    public String processForm(@ModelAttribute("inputData") EquationModel equationModel, Model theModel) {
        if(equationModel.getA() == 0){
            return "error-not-quadratic";
        }

        double discr = equationService.discriminant(equationModel);
        EquationModel equationModelResult = equationService.quadraticEquation(equationModel, discr);

        equationDAO.saveResult(equationModelResult);
        List<EquationModel> equations = equationDAO.getEquations();
        theModel.addAttribute("equations", equations);
        return "equation-result";
    }
}
