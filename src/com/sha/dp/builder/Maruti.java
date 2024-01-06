package com.sha.dp.builder;

public class Maruti {
    private String colour;
    private String cost;

    private Maruti(newBuilder newBuilder){
        this.colour = newBuilder.colour;
        this.cost = newBuilder.cost;
    }

    @Override
    public String toString() {
        return "Maruti{" +
                "colour='" + colour + '\'' +
                ", cost='" + cost + '\'' +
                '}';
    }

    static class newBuilder{
        private String colour;
        private String cost;

        public newBuilder(){

        }
        public newBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public newBuilder setCost(String cost) {
            this.cost = cost;
            return this;
        }

        public Maruti build(){
            Maruti obj = new Maruti(this);
            return obj;
        }
    }
}
