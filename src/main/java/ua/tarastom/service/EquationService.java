package ua.tarastom.service;

import ua.tarastom.entity.EquationModel;

public interface EquationService {
    EquationModel quadraticEquation(EquationModel equationModel, double discr);

    double discriminant(EquationModel equationModel);
}
