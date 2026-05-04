public static class Dog {
    public Dog (int w) {
        weightInPounds = w;
    }

    public int weightInPounds;

    public void MakeNoise() {
        if (weightInPounds < 10){
            IO.println("yipyipyip!");
        }
        else if (weightInPounds < 30){
            IO.println("Bark!");
        }
        else{
            IO.println("WOOF!");
        }
    }

    public static Dog maxDog(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }
    public Dog maxDog2(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) {
            return this;
        }
        return d2;
    }
}



void main() {
    Dog d = new Dog(40);
    Dog D = new Dog(50);
    Dog bigger = Dog.maxDog(d, D);
    bigger.MakeNoise();
}
