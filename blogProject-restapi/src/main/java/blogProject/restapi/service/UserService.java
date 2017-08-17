package blogProject.restapi.service;

import blogProject.manager.bean.TUser;

public interface UserService {
	
	public TUser login(TUser user);

	public boolean regist(TUser user);

	public TUser find(String email);

	public boolean updateStatus(TUser user);

	public void deleteRegistCode(String registCode);
}
