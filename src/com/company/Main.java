package com.company;

public class Main {

    public static void main(String[] args) {
        Myshyk myshyk = new Myshyk();
        myshyk.setName("Myimyi");
        myshyk.setAge(4);
        myshyk.setColor("black");

        System.out.println("Myshyktyn aty: " + myshyk.getName()+ " " +"\nMyshyk: " + myshyk.getAge()+" Jashta" + "\nMyshyktyn onu: " +myshyk.getColor());

        System.out.println("---------------------------------------------------------------------------------------------------------------");

        Popugai popugai = new Popugai();
        popugai.setName("Alex");
        popugai.setColor("green");
        popugai.setUnu("Kaitalap suilop jatat");

        System.out.println("Popugaidyn aty: " + popugai.getName()  + "\nPopugaidyn tusu " + popugai.getColor() + "\nPopugai: " + popugai.getUnu());

        System.out.println("----------------------------------------------------------------------------------------------------------------");

        Balyk balyk = new Balyk();
        balyk.setBalykTuru("Forel");
        balyk.setColor("freckled");
        balyk.setWeight(5);
        balyk.setLength(40);

        System.out.println("Balyktyn turu: " + balyk.getSpecies()+"\nBalyktyn tusu: " +balyk.getColor() + "\nBalyktyn salmagy: " + balyk.getWeight() +"kg"+ "\nBalyktyn uzundugu: " + balyk.getLength() +"cm" );

        System.out.println("-----------------------------------------------------------------------------------------------------------------");

        It it = new It();
        it.setName("Kireshe");
        it.setAge(5);
        it.setColor("white");

        System.out.println("Ittin aty: " + it.getName() +"\nIttin jahsy: " +it.getAge()+ " jashta" + "\nIttin tusu: " + it.getColor());

    }
}

