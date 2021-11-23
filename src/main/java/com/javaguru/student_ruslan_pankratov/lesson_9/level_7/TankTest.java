package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

class TankTest {
    public static void main(String[] args) {
         TankTest tankTest = new TankTest();
         tankTest.ai();
         tankTest.gps();
         tankTest.model();
         tankTest.price();
    }



    void ai(){
        Tank tank = new Tank.TankBuilder().setAi(true).build();//Tank tank = new Tank(); так не создать его
        boolean result = tank.isAi();
        boolean expectedResult = true;

        methodBoolean(result,expectedResult,"ai");
    }

    void gps(){
        Tank tank = new Tank.TankBuilder().setGps(true).build();
        boolean result = tank.isGps();
        boolean expectedResult = true;

        methodBoolean(result,expectedResult,"gps");
    }

    void model(){
        Tank tank = new Tank.TankBuilder().setModel("T-34").build();
        String result = tank.getModel();
        String expectedResult = "T-34";

        methodString(result,expectedResult,"model");
    }

    void price(){
        Tank tank = new Tank.TankBuilder().setPrice(10_000_000).build();
        int result = tank.getPrice();
        int expectedResult = 10_000_000;

        methodInt(result,expectedResult,"price");
    }


    void methodBoolean(boolean result,boolean expectedResult, String name){
        if(result == expectedResult){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIl");
        }
    }

    void methodInt(int result,int expectedResult, String name){
        if(result == expectedResult){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIl");
        }
    }

    void methodString(String result,String expectedResult, String name){
        if(result.equalsIgnoreCase(expectedResult)){
            System.out.println(name + " Test = OK");
        } else {
            System.out.println(name + " Test = FAIl");
        }
    }
}
