package ua.tarastom.service;

import org.springframework.stereotype.Component;
import ua.tarastom.entity.EquationModel;

@Component
public class EquationServiceImpl implements EquationService{
    @Override
    public EquationModel quadraticEquation(EquationModel equationModel, double discr) {
        if (discr == 0) {
            equationModel.setX1(-equationModel.getB() / (2*equationModel.getA()));
            equationModel.setX2(-equationModel.getB() / (2*equationModel.getA()));
        } else if (discr > 0) {
            equationModel.setX1((-equationModel.getB() + Math.sqrt(discr))/(2*equationModel.getA()));
            equationModel.setX2((-equationModel.getB() - Math.sqrt(discr))/(2*equationModel.getA()));
        }
        return equationModel;
    }

    @Override
    public double discriminant(EquationModel equationModel) {
        return equationModel.getB()*equationModel.getB() - 4 * equationModel.getA()*equationModel.getC();
    }
}
