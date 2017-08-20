package blogProject.restapi.service;

import java.util.List;

import blogProject.manager.bean.TLabel;

public interface TLabelService {

    boolean addLabel(TLabel label);

    List<TLabel> getAllLabels();

}
