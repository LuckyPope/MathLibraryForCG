package ru.vsu.cs.zhilyaev;

public class MathForVectors4 {
    public Vector4 sumOfVectors(Vector4 v1, Vector4 v2) {
        return new Vector4(v1.getX() + v2.getX(), v1.getY() + v2.getY(), v1.getZ() + v2.getZ(),
                v1.getM() + v2.getM());
    }

    public Vector4 diffOfVectors(Vector4 v1, Vector4 v2) {
        return new Vector4(v1.getX() - v2.getX(), v1.getY() - v2.getY(), v1.getZ() - v2.getZ(),
                v1.getM() - v2.getM());
    }

    public Vector4 increaseVectorOnNumber(Vector4 v1, float n) {
        return new Vector4(v1.getX() * n, v1.getY() * n, v1.getZ() * n, v1.getM() * n);
    }

    public Vector4 divisionVectorOnNumber(Vector4 v1, float n) {
        if(n == 0) {
            System.out.println("На 0 делить нельзя");
            return null;
        }

        return new Vector4(v1.getX() / n, v1.getY() / n, v1.getZ() / n, v1.getM() / n);
    }

    public float lengthOfVector(Vector4 v1) {
        return (float) Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ() +
                v1.getM() * v1.getM());
    }

    public float scalarProduct(Vector4 v1, Vector4 v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ() +
                v1.getM() * v2.getM();
    }

    public Vector4 normalization(Vector4 v1) {
        float invLength = (float) (1 / (Math.sqrt(v1.getX() * v1.getX() + v1.getY() * v1.getY() + v1.getZ() * v1.getZ() +
                        v1.getM() * v1.getM())));
        return new Vector4(v1.getX() * invLength, v1.getY() * invLength, v1.getZ() * invLength,
                v1.getM() * invLength);
    }
}
