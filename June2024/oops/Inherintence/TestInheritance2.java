package June2024.oops.Inherintence;

class Animal {
    void bark() {
        System.out.println("barking..Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("barking...Dog");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("weeping...");
    }

    void bark() {
        System.out.println("barking...babyDog");
    }
}

class TestInheritance2 {
    public static void main(String args[]) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
    }
}
