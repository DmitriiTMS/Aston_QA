package com.chunosov.park;

import java.math.BigDecimal;

public class Park {

    public class Attraction {
        private String name;
        private String workingHours;
        private BigDecimal price;

        public Attraction(String name, String workingHours, BigDecimal price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWorkingHours() {
            return workingHours;
        }

        public void setWorkingHours(String workingHours) {
            this.workingHours = workingHours;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public void setPrice(BigDecimal price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", workingHours='" + workingHours + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
