package constant;

/**
 * Interface IConstant chứa các hằng số Regex dùng để kiểm tra dữ liệu đầu vào.
 */
public interface IConstant {
    /**
     * Regex cho tên sinh viên: chỉ cho phép chữ cái (A-Z, a-z) và khoảng trắng.
     */
    String REGEX_NAME = "^[A-Za-z\\s]+$";

    /**
     * Regex cho lớp học: cho phép chữ cái, số và khoảng trắng.
     */
    String REGEX_CLASS = "^[A-Za-z0-9\\s]+$";

    /**
     * Regex cho lựa chọn Y/N: chỉ cho phép nhập "Y" hoặc "N".
     */
    String REGEX_YN = "^[YNyn]$";
}
