import java.util.*;
class TodoListData
  {
    String game_name;
    int game_players;
    String player_names;
    public TodoList
    Data(String gn,int gp,String pn)
    {
      game_name=gn;
      game_players=gp;
      player_names=pn;
    }
	public String getGame_name() {
		return game_name;
	}
	public void setGame_name(String game_name) {
		this.game_name = game_name;
	}
	public int getGame_players() {
		return game_players;
	}
	public void setGame_players(int game_players) {
		this.game_players = game_players;
	}
	public String getPlayer_names() {
		return player_names;
	}
	public void setPlayer_names(String player_names) {
		this.player_names = player_names;
	}
    
  }