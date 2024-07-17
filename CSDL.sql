create database ASM_Du_An_Mau
use ASM_Du_An_Mau
go

create table Nhan_vien(
MaNV nvarchar(20) primary key not null,
MatKhau nvarchar(50) not null,
HoTen nvarchar(50) not null,
VaiTro bit default 0
)

create table Nguoi_Hoc(
MaNH nchar(7) primary key not null,
HoTen nvarchar(50) not null,
GioiTinh bit default 1,
NgaySinh date not null,
DienThoai nvarchar(24) not null,
Email nvarchar(50) not null,
GhiChu nvarchar(255) null,
MaNV nvarchar(20) not null,
foreign key (MaNV) references Nhan_vien(MaNV),
NgayDK date default getdate()
)

create table Chuyen_De(
MaCD nchar(5) primary key not null,
TenCD nvarchar(50) not null,
HocPhi float not null,
ThoiLuong int not null,
Hinh nvarchar(50) not null,
MoTa nvarchar(255) not null
)

create table Khoa_Hoc(
MaKH int primary key identity(1,1),
MaCD nchar(5) not null,
foreign key (MaCD) references Chuyen_De(MaCD),
HocPhi float not null,
THoiLuong int not null,
NgayKG date not null,
GhiChu nvarchar(255) null,
MaNV nvarchar(20) not null,
foreign key (MaNV) references Nhan_vien(MaNV),
NgayTao date default getdate()
)

create table Hoc_Vien(
MaHV int primary key identity(1,1),
MaKH int not null,
foreign key (MaKH) references Khoa_Hoc(MaKH),
MaNH nchar(7) not null,
foreign key (MaNH) references Nguoi_Hoc(MaNH),
Diem float default -1
)

insert into Nhan_vien values('NV001','MatKhauNV1','Nguyen Van A',1),
('NV002','MatKhauNV2','Nguyen Van B',),
('NV003','MatKhauNV3','Nguyen Van C',1),
('NV004','MatKhauNV4','Nguyen Van D',1),
('NV005','MatKhauNV5','Nguyen Van E',1)



insert into Nguoi_Hoc values('NH001','Pham Thi A',0,'2000-2-3','0987654321','phamthia@gmail.com','','NV001','2023-9-10'),
('NH002','Pham Thi B',0,'2001-2-3','0987654322','phamthib@gmail.com','','NV001','2023-9-10'),
('NH003','Pham Thi C',0,'2002-2-3','0987654323','phamthic@gmail.com','','NV001','2023-9-10'),
('NH004','Pham Thi D',0,'2001-5-6','0987654324','phamthid@gmail.com','','NV001','2023-9-10'),
('NH005','Pham Thi E',0,'2000-7-12','0987654325','','','NV001','2023-9-10')


insert into Chuyen_De values('CD001','Chuyen De so 1',12000000,120,'Hinh Anh 1','Mo ta so 1'),
('CD002','Chuyen De so 2',12000000,120,'Hinh Anh 2','Mo ta so 2'),
('CD003','Chuyen De so 3',12000000,120,'Hinh Anh 3','Mo ta so 3'),
('CD004','Chuyen De so 4',12000000,120,'Hinh Anh 4','Mo ta so 4'),
('CD005','Chuyen De so 5',12000000,120,'Hinh Anh 5','Mo ta so 5')


insert into Khoa_Hoc values('CD001',12000000,120,'2023-11-12','Ghi Chu 1','NV001','2024-1-1'),
('CD002',12000000,120,'2023-11-12','','NV001','2024-1-1'),
('CD003',12000000,120,'2023-11-12','Ghi Chu 2','NV002','2024-1-1'),
('CD004',12000000,120,'2023-11-12','Ghi Chu 3','NV003','2024-1-1'),
('CD005',12000000,120,'2023-11-12','Ghi Chu 4','NV004','2024-1-1')


insert into Hoc_Vien values('1','NH001',9),
('2','NH002',9),
('3','NH003',9),
('4','NH004',9),
('5','NH005',9)

select*from Nhan_vien
select*from Nguoi_Hoc
select * from Chuyen_De
select * from Khoa_Hoc
select*from Hoc_Vien