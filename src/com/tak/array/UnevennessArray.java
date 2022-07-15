package com.tak.array;

import java.util.Scanner;

public class UnevennessArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                    //입력받기 위함

        System.out.println("불규칙한 2차원 배열을 생성합니다.");      //명령
        System.out.print("행 수 : ");                            //행 수 입력
        int height = sc.nextInt();                              //행 수 적용

        int[][] c = new int[height][];                          //행 수 위치 적용

        for (int i = 0; i < c.length; i++) {                    //열의 갯수 입력
            System.out.print(i + "행째의 열 수 : ");
            int width = sc.nextInt();
            c[i] = new int[width];
        }

        System.out.println("각 요소의 값을 입력하세요.");           //요소들의 값을 입력
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("c[%d][%d] : ",i ,j);
                c[i][j] = sc.nextInt();
            }
        }

        System.out.println("배열 c의 각 요소값은 다음과 같습니다.");   //입력 받은 요소들의 값을 바탕으로 열의 수를 구분하여 출력
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.printf("%3d", c[i][j]);
            }
            System.out.println();
        }
    }
}
