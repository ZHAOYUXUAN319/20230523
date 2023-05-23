package javaJdbc;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class HeyaDelectTest {
  @Test
  public void HeyaDelect() {
      BukenService bukenService = new BukenService();
      
      HeyaBean bkBean = new HeyaBean();
      bkBean.setRoomId("1");
      
      try {
			bukenService.heyeDelete(bkBean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
      
  }
}