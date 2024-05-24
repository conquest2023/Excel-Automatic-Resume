package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResumeView {

    public Personlnfo inputPersonInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("사진 파일명을 입력하세요:");
        String photo = sc.nextLine();
        System.out.print("이름을 입력하세요:");
        String name = sc.next();
        System.out.print("이메일을 입력하세요:");
        String email = sc.next();
        System.out.print("주소를 입력하세요:");
        String address = sc.next();
        System.out.print("핸드폰 번호를 입력하세요:");
        int phoneNumber = sc.nextInt();
        System.out.print("생일을 입력하세요");
        int birthDate = sc.nextInt();
        return new Personlnfo(photo, name, email, address, phoneNumber, birthDate);

    }

    public List<Education> inputEducationList() {
        List<Education> educations = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("학력 정보를 입력하세요 (종료는 q):");
            String graduationStatus = sc.nextLine();
            if (graduationStatus.equals("q")) {
                break;
            }
            System.out.println("졸업년도  " + "학교명  " + "전공  " + "졸업여부  ");
            int graduationYear = sc.nextInt();
            String major = sc.nextLine();
            String schoolName = sc.nextLine();
            Education education = new Education(graduationStatus, graduationYear, major, schoolName);
            educations.add(education);
        }
        return  educations;
    }
        public List<Career> inputCareerList() {
            List<Career> careers = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("경력 정보를 입력하세요 (종료는 q)");
                String companyName = sc.nextLine();
                if (companyName.equals("q")) {
                    break;
                }
                System.out.println("근무기간  " + "근무처  " + "담당업무  " + "근속연수  ");
                int employmentYears = sc.nextInt();
                String jobtitle = sc.nextLine();
                int workPeriod = sc.nextInt();
                Career career = new Career(companyName, employmentYears, jobtitle, workPeriod);
                careers.add(career);
            }
            return careers;
        }

    public String inputSelfIntroduciton() {

        Scanner sc = new Scanner(System.in);
        System.out.println("자기소개를 입력하세요.여러 줄을 입력하려면 빈 줄을 입력하세요.");
        String SelfIntroduction = sc.next();

        System.out.println("이력서가 완성되었습니다.");
        return SelfIntroduction;
    }


}
