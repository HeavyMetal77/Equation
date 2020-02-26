package ua.tarastom.dao;

import ua.tarastom.entity.EquationModel;

import java.util.List;

public interface EquationDAO {
    void saveResult(EquationModel equationModel);

    List<EquationModel> getEquations();
}
