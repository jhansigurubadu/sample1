package oopsconcept;

 abstract class Animal {
     abstract void sleep();
 }
 class Cat extends Animal {
    private int legs;

     public int getLegs() {
         return legs;
     }

     public void setLegs(int legs) {
         this.legs = legs;
     }

     public void sleep() {
         System.out.println("The animal has: " + legs);
    }

     public static void main(String[] args) {
         Cat c = new Cat();
         c.setLegs(4);
         c.sleep();
     }
 }


