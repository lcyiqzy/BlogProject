package blogProject.manager.service;

import java.util.List;

import blogProject.manager.bean.TUser;

public interface TUserService {

    List<TUser> getAllUsers();

    TUser getUser(TUser user);

}
