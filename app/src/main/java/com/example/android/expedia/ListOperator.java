package com.example.android.expedia;

import com.example.android.expedia.operators.MulOperator;
import com.example.android.expedia.operators.Operator;
import com.example.android.expedia.operators.SumOperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Android on 8/1/2017.
 */

class ListOperator {

    public List<Integer> sumNumbers(List<Integer> integers, int number) {
        return operateNumbers(integers, number, new SumOperator());
    }

    public List<Integer> sumThirds(List<Integer> integers) {
        return sumNumbers(integers, 3);
    }

    public List<Integer> multiplyNumbers(List<Integer> integers, int number) {
        return operateNumbers(integers, number, new MulOperator());
    }

    public List<Integer> operateNumbers(List<Integer> integers, int number, Operator operator) {
        ArrayList<Integer> aux = new ArrayList<>();
        for (int i = 0; i < integers.size() - number + 1; i++) {
            int tmpValue = integers.get(i);
            for (int j = 1; j < number; j++) {
                tmpValue = operator.operate(tmpValue, integers.get(i + j));
            }
            aux.add(tmpValue);
        }

        return aux;
    }
}
