package ua.tarastom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.tarastom.dao.EquationDAOImpl;
import ua.tarastom.entity.EquationModel;

@Controller
@RequestMapping("/equation")
public class EquationController {

    @Autowired
    EquationDAOImpl equationDAOImpl;

    @RequestMapping(value = "/showForm", method = RequestMethod.GET)
    public String showForm(Model theModel) {

        EquationModel equationModel = new EquationModel();
        theModel.addAttribute("inputData", equationModel);
        return "inputData";
    }

    @RequestMapping(value = "/processForm" , method = RequestMethod.POST)
    public String processForm(@ModelAttribute("inputData") EquationModel equationModel, Model theModel) {
        double discriminant = equationModel.getB()*equationModel.getB() - 4 * equationModel.getA()*equationModel.getC();
        if (discriminant < 0) {
            return "error";
        }else if (discriminant == 0) {
            equationModel.setX1(-equationModel.getB() / (2*equationModel.getA()));
            equationModel.setX2(-equationModel.getB() / (2*equationModel.getA()));
        } else if (discriminant > 0) {
            equationModel.setX1((-equationModel.getB() + Math.sqrt(discriminant))/2*equationModel.getA());
            equationModel.setX2((-equationModel.getB() - Math.sqrt(discriminant))/2*equationModel.getA());
        }

        equationDAOImpl.saveResult(equationModel);
        theModel.addAttribute("resultEquationModel", equationModel);

        return "equation-result";
    }
}
