package com.general.calculator_using_servlet;

public class Calculator {

    public String getResult(String num1, String num2, String operation) {

        String result;

        if (operation != null && num1 != null && num2 != null) {

            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);

            switch (operation) {

                case "add":

                    result = num1 + " + " + num2 + " = " + String.valueOf(n1 + n2);
                    break;

                case "sub":

                    result = num1 + " - " + num2 + " = " + String.valueOf(n1 - n2);
                    break;

                case "mul":

                    result = num1 + " * " + num2 + " = " + String.valueOf(n1 * n2);
                    break;

                case "div":

                    if (n2 == 0) {

                        result = "Cannot divide by zero";
                        break;
                    }

                    result = num1 + " / " + num2 + " = " + String.valueOf(n1 / n2);
                    break;

                default:

                    result = "Invalid operation";
            }
        }
        else {

            result = "Please enter valid values";
        }

        return result;
    }
}
