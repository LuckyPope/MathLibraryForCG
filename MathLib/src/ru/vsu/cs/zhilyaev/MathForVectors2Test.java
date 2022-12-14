package ru.vsu.cs.zhilyaev;

import org.junit.jupiter.api.Test;

class MathForVectors2Test {
    MathForVectors2 mathForVectors2 = new MathForVectors2();

    @Test
    void sumOfVectors() {
        Vector2 v1 = new Vector2(1, 2);
        Vector2 v2 = new Vector2(5, 6);

        Vector2 vectorFromMethod = mathForVectors2.sumOfVectors(v1, v2);
        Vector2 vectorResult = new Vector2(6, 8);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
    }

    @Test
    void diffOfVectors() {
        Vector2 v1 = new Vector2(1, 2);
        Vector2 v2 = new Vector2(5, 6);

        Vector2 vectorFromMethod = mathForVectors2.diffOfVectors(v1, v2);
        Vector2 vectorResult = new Vector2(-4, -4);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
    }

    @Test
    void increaseVectorOnNumber() {
        Vector2 v1 = new Vector2(1, 2);
        float n = 5.0f;

        Vector2 vectorFromMethod = mathForVectors2.increaseVectorOnNumber(v1, n);
        Vector2 vectorResult = new Vector2(5, 10);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
    }

    @Test
    void divisionVectorOnZero() {
        Vector2 v1 = new Vector2(1, 2);
        float n = 0;

        Vector2 vectorFromMethod = mathForVectors2.divisionVectorOnNumber(v1, n);
        assert vectorFromMethod == null;
    }

    @Test
    void divisionVectorOnNumber() {
        Vector2 v1 = new Vector2(6, 8);
        float n = 2;

        Vector2 vectorFromMethod = mathForVectors2.divisionVectorOnNumber(v1, n);
        Vector2 vectorResult = new Vector2(3, 4);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
    }

    @Test
    void lengthOfVector() {
        Vector2 v1 = new Vector2(6, 8);

        float lengthFromMethod = mathForVectors2.lengthOfVector(v1);
        float lengthResult = 10.0f;

        double eps = 1e-6;

        assert (lengthResult - lengthFromMethod) < eps;
    }

    @Test
    void scalarProduct() {
        Vector2 v1 = new Vector2(6, 8);
        Vector2 v2 = new Vector2(5, 4);

        double resultFromMethod = mathForVectors2.scalarProduct(v1, v2);
        double result = 62;

        double eps = 1e-6;

        assert  (result - resultFromMethod) < eps;
    }

    @Test
    void normalization() {
        Vector2 v1 = new Vector2(6, 8);

        Vector2 vectorFromMethod = mathForVectors2.normalization(v1);
        Vector2 vectorResult = new Vector2(6 * 0.1f,8 * 0.1f);

        double eps = 1e-6;

        assert (vectorFromMethod.getX() - vectorResult.getX()) < eps;
        assert (vectorFromMethod.getY() - vectorResult.getY()) < eps;
    }
}