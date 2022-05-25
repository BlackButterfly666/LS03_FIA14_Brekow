package model.persistence;

import model.User;

public interface IUserPersistence {

	User readUser(String username);

}