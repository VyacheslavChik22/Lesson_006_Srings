import java.util.Locale;

public class Strings {
    public static void main(String[] args) {
// ������� 1 ����������� ��������� �������� ���������, � ������ ����� �������� � �.�.�. �����������.
        System.out.println("\n*** ������� 1: �������, ���, �������� ���������� ***");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName +  middleName;
        System.out.println(fullName);

// ������� 2 �.�.�. ���������� ������ ���� �������� � ������� ��������.

        System.out.println("\n*** ������� 2: �������, ���, �������� ���������� ������� � ������� �������� ***");

        String fullNameUpp = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullNameUpp);

// ������� 3 �������, � ������� �� ��������, �� ��������� ������ ���.
//������� ��� ����� �������� ���������, ������� �������� ������ ��� �� ������ ��.
//� �������� �������� ������ ����������� ������ fullName � ������ � ��� ������� ���� ���������.
        System.out.println("\n*** ������� 3: �������� ���������, ������� �������� ������ ��� �� ������ �� ***");

        fullName = "������ ���� ��������";
        fullName = fullName.replace("�", "e");
        System.out.println(fullName);


    }
}
