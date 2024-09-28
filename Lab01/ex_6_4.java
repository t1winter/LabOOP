package Lab01;
import java.util.Scanner;

public class ex_6_4  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0, year = 0;
        // Input
        while (true) {
            System.out.print("Nhap thang: ");
            String monthInput = scanner.nextLine().trim();

            month = convertMonthtoNum(monthInput);
            
            System.out.print("Nhap nam: ");
            year = scanner.nextInt();
            
            if (month >= 1 && month <= 12 && year > 0) {
                break;
            } else {
                System.out.println("Sai thang hoac nam. Try again.");
                scanner.nextLine();
            }
        }
        int days = getDaysInMonth(month, year);
        System.out.println("So ngay la: " + days);
        scanner.close();
    }
    // convert month -> num
    public static int convertMonthtoNum(String monthInput) {
        switch (monthInput.toLowerCase()) {
            case "january": case "jan.": case "jan": case "1": return 1;
            case "february": case "feb.": case "feb": case "2": return 2;
            case "march": case "mar.": case "mar": case "3": return 3;
            case "april": case "apr.": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun.": case "jun": case "6": return 6;
            case "july": case "jul.": case "jul": case "7": return 7;
            case "august": case "aug.": case "aug": case "8": return 8;
            case "september": case "sep.": case "sep": case "9": return 9;
            case "october": case "oct.": case "oct": case "10": return 10;
            case "november": case "nov.": case "nov": case "11": return 11;
            case "december": case "dec.": case "dec": case "12": return 12;
            default: return -1; // Invalid month input
        }
    }

    // ham dem so ngay
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                return 31;
            case 4:  
            case 6:  
            case 9:  
            case 11: 
                return 30;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    // ham check leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}

