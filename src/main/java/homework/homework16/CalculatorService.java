package homework.homework16;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public int plus (int numA, int numB) {
        return numA+numB;
    }
    public int minus (int numA, int numB) {
        return numA-numB;
    }
    public int multiply (int numA, int numB) {
        return numA*numB;
    }
    public int divide (int numA, int numB) {
        return numA / numB;
    }
}
