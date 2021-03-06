USE [master]
GO
/****** Object:  Database [follow_your_customer]    Script Date: 5/1/2020 5:06:09 PM ******/
CREATE DATABASE [follow_your_customer]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'follow_your_customer', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\follow_your_customer.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'follow_your_customer_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\follow_your_customer_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [follow_your_customer] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [follow_your_customer].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [follow_your_customer] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [follow_your_customer] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [follow_your_customer] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [follow_your_customer] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [follow_your_customer] SET ARITHABORT OFF 
GO
ALTER DATABASE [follow_your_customer] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [follow_your_customer] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [follow_your_customer] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [follow_your_customer] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [follow_your_customer] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [follow_your_customer] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [follow_your_customer] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [follow_your_customer] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [follow_your_customer] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [follow_your_customer] SET  DISABLE_BROKER 
GO
ALTER DATABASE [follow_your_customer] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [follow_your_customer] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [follow_your_customer] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [follow_your_customer] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [follow_your_customer] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [follow_your_customer] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [follow_your_customer] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [follow_your_customer] SET RECOVERY FULL 
GO
ALTER DATABASE [follow_your_customer] SET  MULTI_USER 
GO
ALTER DATABASE [follow_your_customer] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [follow_your_customer] SET DB_CHAINING OFF 
GO
ALTER DATABASE [follow_your_customer] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [follow_your_customer] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [follow_your_customer] SET DELAYED_DURABILITY = DISABLED 
GO
USE [follow_your_customer]
GO
/****** Object:  User [admin]    Script Date: 5/1/2020 5:06:09 PM ******/
CREATE USER [admin] FOR LOGIN [admin] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [admin]
GO
ALTER ROLE [db_accessadmin] ADD MEMBER [admin]
GO
ALTER ROLE [db_securityadmin] ADD MEMBER [admin]
GO
ALTER ROLE [db_ddladmin] ADD MEMBER [admin]
GO
ALTER ROLE [db_backupoperator] ADD MEMBER [admin]
GO
ALTER ROLE [db_datareader] ADD MEMBER [admin]
GO
ALTER ROLE [db_datawriter] ADD MEMBER [admin]
GO
ALTER ROLE [db_denydatareader] ADD MEMBER [admin]
GO
ALTER ROLE [db_denydatawriter] ADD MEMBER [admin]
GO
/****** Object:  Table [dbo].[Contact]    Script Date: 5/1/2020 5:06:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Contact](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[Phone] [bigint] NULL,
	[Fax] [bigint] NULL,
	[Mail] [nvarchar](50) NULL,
	[Social_Media] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ID]    Script Date: 5/1/2020 5:06:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ID](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[CitizenShip_Number] [bigint] NULL,
	[HomeLand] [nvarchar](50) NULL,
	[year] [nvarchar](50) NULL,
	[Job] [nchar](10) NULL,
	[Monthly_Earnings] [bigint] NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Products_Owned]    Script Date: 5/1/2020 5:06:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Products_Owned](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[Build] [nvarchar](50) NULL,
	[Vehicle] [nvarchar](50) NULL,
	[Land] [nvarchar](50) NULL
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[users]    Script Date: 5/1/2020 5:06:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[users](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NULL,
	[password] [nvarchar](50) NULL
) ON [PRIMARY]

GO
SET IDENTITY_INSERT [dbo].[Contact] ON 

INSERT [dbo].[Contact] ([id], [Phone], [Fax], [Mail], [Social_Media]) VALUES (1, 5347834106, 53452727187, N'brnkemer@gmail', N'barankemeer')
INSERT [dbo].[Contact] ([id], [Phone], [Fax], [Mail], [Social_Media]) VALUES (3, 8284200393, 92893829, N'emrctkyn@gmail.com', N'emirctkny')
INSERT [dbo].[Contact] ([id], [Phone], [Fax], [Mail], [Social_Media]) VALUES (4, 9389129, 87287332, N'kaansurdem@gmail.com', N'kaansurdemcilginboy')
SET IDENTITY_INSERT [dbo].[Contact] OFF
SET IDENTITY_INSERT [dbo].[ID] ON 

INSERT [dbo].[ID] ([id], [CitizenShip_Number], [HomeLand], [year], [Job], [Monthly_Earnings]) VALUES (1, 3213131213, N'abd', N'1999', N'Lawyer    ', 22000)
INSERT [dbo].[ID] ([id], [CitizenShip_Number], [HomeLand], [year], [Job], [Monthly_Earnings]) VALUES (5, 23123178, N'kayseri', N'2001', N'Yazilimci ', 29902)
SET IDENTITY_INSERT [dbo].[ID] OFF
SET IDENTITY_INSERT [dbo].[Products_Owned] ON 

INSERT [dbo].[Products_Owned] ([id], [Build], [Vehicle], [Land]) VALUES (1, N'Sancak Apt', N'Volvo', N'Kazım sokak')
INSERT [dbo].[Products_Owned] ([id], [Build], [Vehicle], [Land]) VALUES (3, N'yok', N'salcano', N'Feriköy')
INSERT [dbo].[Products_Owned] ([id], [Build], [Vehicle], [Land]) VALUES (4, N'yok', N'Donkey', N'Essek cenneti')
SET IDENTITY_INSERT [dbo].[Products_Owned] OFF
SET IDENTITY_INSERT [dbo].[users] ON 

INSERT [dbo].[users] ([id], [username], [password]) VALUES (1, N'admin', N'admin')
SET IDENTITY_INSERT [dbo].[users] OFF
USE [master]
GO
ALTER DATABASE [follow_your_customer] SET  READ_WRITE 
GO
