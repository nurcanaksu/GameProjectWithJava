package Concrete;

import Entity.Gamer;

public interface GameService
{
	void register(Gamer gamer) throws Exception;
	void update(Gamer gamer) throws Exception;
	void delete(Gamer gamer) throws Exception;

}
