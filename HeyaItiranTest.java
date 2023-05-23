package javaJdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import java.sql.SQLException;
import java.util.List;

public class HeyaItiranTest {
	  //部屋一覧(全部)
    @Test
    public void testkanrisyaheyalistInfo() {
        BukenService bukenService = new BukenService();
        List<HeyaBean> resultHeya = bukenService.kanrisyaheyalistInfo();

        // 返却の内容はnullかどうか
        Assertions.assertNotNull(resultHeya);

        // 返却の内容の件数合うかどうか
        Assertions.assertEquals(14, resultHeya.size());

        // 返却の内容の第一位
        HeyaBean firstHeya = resultHeya.get(0);
        Assertions.assertEquals("1", firstHeya.getRoomId());
        Assertions.assertEquals("1", firstHeya.getSyozokuPropertyId());
        Assertions.assertEquals("1", firstHeya.getRoomName());
        Assertions.assertEquals("1", firstHeya.getRoomFloor());
        Assertions.assertEquals("1", firstHeya.getPrice());
        Assertions.assertEquals("1", firstHeya.getStation());
        Assertions.assertEquals("1", firstHeya.getRoomArea());
        Assertions.assertEquals("1", firstHeya.getMinutesFromStation());

    }
  //部屋一覧(0個)
    @Test
    public void testKanrisyabukenlistInfo2() {
        BukenService bukenService = new BukenService();
        List<HeyaBean> resultHeya = bukenService.kanrisyaheyalistInfo();

        // 返却の内容はnullかどうか
        Assertions.assertNotNull(resultHeya);


    }
    //部屋一覧(１個)
    @Test
    public void testKanrisyabukenlistInfo3() {
        BukenService bukenService = new BukenService();
        List<HeyaBean> resultHeya = bukenService.kanrisyaheyalistInfo();

        // 返却の内容はnullかどうか
        Assertions.assertNotNull(resultHeya);

        // 返却の内容の件数合うかどうか
        Assertions.assertEquals(1, resultHeya.size());

        // 返却の内容の第一位
        HeyaBean firstHeya = resultHeya.get(0);
        Assertions.assertEquals("1", firstHeya.getRoomId());
        Assertions.assertEquals("1", firstHeya.getSyozokuPropertyId());
        Assertions.assertEquals("1", firstHeya.getRoomName());
        Assertions.assertEquals("1", firstHeya.getRoomFloor());
        Assertions.assertEquals("1", firstHeya.getPrice());
        Assertions.assertEquals("1", firstHeya.getStation());
        Assertions.assertEquals("1", firstHeya.getRoomArea());
        Assertions.assertEquals("1", firstHeya.getMinutesFromStation());
    }
}