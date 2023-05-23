package javaJdbc;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BukenServiceTest {

    private BukenService bukenService;

    @BeforeEach
    void setUp() {
        bukenService = new BukenService();
    }

    @Test
    void testHeyakensaku_WhenRoomExists_ReturnsMatchingRooms() {
        // 创建测试数据
        //HeyaBean heyaBean2 = new HeyaBean();
        //heyaBean2.setRoomId("1");

        // 执行测试方法
        List<HeyaBean> result = bukenService.heyakensaku("1");

        // 验证结果
        Assertions.assertNotNull(result);
        Assertions.assertFalse(result.isEmpty());
        Assertions.assertEquals(1, result.size());

        // 验证第一个返回的HeyaBean对象的属性值
        HeyaBean firstHeya = result.get(0);
        Assertions.assertEquals("1", firstHeya.getRoomId());
        Assertions.assertEquals("expectedValue", firstHeya.getSyozokuPropertyId());
        Assertions.assertEquals("expectedValue", firstHeya.getRoomName());
        Assertions.assertEquals("expectedValue", firstHeya.getRoomFloor());
        Assertions.assertEquals("expectedValue", firstHeya.getPrice());
        Assertions.assertEquals("expectedValue", firstHeya.getStation());
        Assertions.assertEquals("expectedValue", firstHeya.getRoomArea());
        Assertions.assertEquals("expectedValue", firstHeya.getMinutesFromStation());
    }
  
}