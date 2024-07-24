/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package response;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor   // contructor full tham so 
@NoArgsConstructor // contructor k tham so 
@Getter
@Setter
@ToString
@Builder
/**
 *
 * @author pc
 */
public class HoaDonResponse {

    private String ID_HoaDon;
    private String ID_NhanVien;
    private String ThoiGianTao;
    private String TenKhachHang;
    private String SDT;
    private String SoCCCD;
    private boolean GioiTinh;
    
    
}
