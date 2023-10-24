package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
private Main main =new Main();
@Test
    public void one(){
    //given
    int[]tab={1,2,1,3,2,5};
    //when
    int[] ints = main.singleNumber(tab);
    //then
    int[]exp={3,5};
    assertArrayEquals(exp,ints);
}
    @Test
    public void two(){
        //given
        int[]tab={-1,0};
        //when
        int[] ints = main.singleNumber(tab);
        //then
        int[]exp={-1,0};
        assertArrayEquals(exp,ints);
    }
    @Test
    public void three(){
        //given
        int[]tab={21,67,12,67,1,5,21,78};
        //when
        int[] ints = main.singleNumber(tab);
        //then
        int[]exp={12,1,5,78};
        assertArrayEquals(exp,ints);
    }

}