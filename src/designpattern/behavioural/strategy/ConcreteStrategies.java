package designpattern.behavioural.strategy;

// Implement Concrete Strategies
class Addition implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a + b;
    }
}

class Subtraction implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a - b;
    }
}

class Multiplication implements MathOperation {
    @Override
    public int performOperation(int a, int b) {
        return a * b;
    }
}
