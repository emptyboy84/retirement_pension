package com.dc;

import java.util.Scanner;

public class DCRetirementReturn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("초기 투자금을 입력하세요: ");
        double initialInvestment = scanner.nextDouble();

        System.out.print("최종 가치를 입력하세요: ");
        double finalValue = scanner.nextDouble();

        System.out.print("투자 기간(년)을 입력하세요: ");
        int years = scanner.nextInt();

        double rateOfReturn = calculateDCRetirementReturn(initialInvestment, finalValue, years);

        System.out.printf("연간 수익률: %.2f%%\n", rateOfReturn * 100);

        scanner.close();
    }

    public static double calculateDCRetirementReturn(double initialInvestment, double finalValue, int years) {
        return Math.pow(finalValue / initialInvestment, 1.0 / years) - 1;
    }
}
