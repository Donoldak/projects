public class Area {

    static public int calArea(Prymoug samePr){
        int area = 0;
        return area = samePr.getHeight() * samePr.getWidth();
    }

    static public int calArea(Sqrt sameSqrt){
        int area = 0;
        return area = sameSqrt.getWidth() * sameSqrt.getWidth();
    }

    static public int calAreaOfAll(Prymoug[] samePrymoug){
        int sum = 0;
        for (int i = 0; i<samePrymoug.length; i++){
            sum = sum + calArea(samePrymoug[i]);
        }
        return sum;
    }

    static public int calAreaOfAll(Sqrt[] sameSqrt){
        int sum = 0;
        for (int i = 0; i<sameSqrt.length; i++){
            sum = sum + calArea(sameSqrt[i]);
        }
        return sum;
    }

    static public double maxArea(Prymoug[] samePr){
        int max = calArea(samePr[0]);
        for (int i = 0; i<samePr.length; i++){
            if (calArea(samePr[i])>max){
                max = calArea(samePr[i]);
            }
        }
        return max;
    }

    static public double maxArea(Sqrt[] sameSqrt){
        int max = calArea(sameSqrt[0]);
        for (int i = 0; i<sameSqrt.length; i++){
            if (calArea(sameSqrt[i])>max){
                max = calArea(sameSqrt[i]);
            }
        }
        return max;
    }

    static public double minArea(Prymoug[] samePr){
        int min = calArea(samePr[0]);
        for (int i = 0; i<samePr.length; i++){
            if (calArea(samePr[i])<min){
                min = calArea(samePr[i]);
            }
        }
        return min;
    }

    static public double minArea(Sqrt[] sameSqrt){
        int min = calArea(sameSqrt[0]);
        for (int i = 0; i<sameSqrt.length; i++){
            if (calArea(sameSqrt[i])<min){
                min = calArea(sameSqrt[i]);
            }
        }
        return min;
    }
}
