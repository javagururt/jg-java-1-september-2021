package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

import com.javaguru.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Tank {
    private String model;//создаём приватные поля
    private int weight;
    private int caliber;
    private int speed;
    private String material;
    private int crew;
    private boolean ai;
    private boolean gps;
    private int price;

    public String getModel() {
        return model;//здесь делаем только геты
    }

    public int getWeight() {
        return weight;
    }

    public int getCaliber() {
        return caliber;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMaterial() {
        return material;
    }

    public int getCrew() {
        return crew;
    }

    public boolean isAi() {
        return ai;
    }

    public boolean isGps() {
        return gps;
    }

    public int getPrice() {
        return price;
    }

    private Tank(TankBuilder builder) {//так же должен быть приватным, чтобы не было обязательного создания
        this.model = builder.model;
        this.weight = builder.weight;
        this.caliber = builder.caliber;
        this.speed = builder.speed;
        this.material = builder.material;
        this.crew = builder.crew;
        this.ai = builder.ai;
        this.gps = builder.gps;
        this.price = builder.price;
    }


    @Override
    public String toString() {
        return "Tank{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", caliber=" + caliber +
                ", speed=" + speed +
                ", material='" + material + '\'' +
                ", crew=" + crew +
                ", ai=" + ai +
                ", gps=" + gps +
                ", price=" + price +
                '}';
    }

    public static class TankBuilder{//создаём статический класс
       private String model;//и передаём сюда все свои поля
       private int weight;
       private int caliber;
       private int speed;
       private String material;
       private int crew;
       private boolean ai;
       private boolean gps;
       private int price;


        public TankBuilder setModel(String model) {//вместо войда, пишем имя класс TankBuilder
            this.model = model;
            return this;//и не забываем сделать ретурн, в данном случае, это зис, то есть мы возвращаем этот же класс
        }

        public TankBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public TankBuilder setCaliber(int caliber) {
            this.caliber = caliber;
          return this;
        }

        public TankBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public TankBuilder setMaterial(String material) {
            this.material = material;
            return this;
        }

        public TankBuilder setCrew(int crew) {
            this.crew = crew;
            return this;
        }

        public TankBuilder setAi(boolean ai) {
            this.ai = ai;
            return this;
        }

        public TankBuilder setGps(boolean gps) {
            this.gps = gps;
            return this;
        }

        public TankBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Tank build(){//здесь пишется build, чтобы окончить программу, и все значения из статика
            //перекинуть в танк
            Tank user = new Tank(this);//вот здесь мы создаём новый танк, который получает в поле статик танка через this
            return user;
        }
    }
}
