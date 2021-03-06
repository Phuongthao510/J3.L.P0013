CREATE DATABASE [Sushi]
USE [Sushi]
GO
/****** Object:  Table [dbo].[Information]    Script Date: 12/24/2020 17:13:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Information](
	[description] [nvarchar](300) NULL,
	[address] [nvarchar](150) NULL,
	[phone] [varchar](150) NULL,
	[email] [varchar](150) NULL,
	[openingHours] [varchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Menu]    Script Date: 12/24/2020 17:13:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Menu](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[name] [nvarchar](150) NULL,
	[price] [float] NULL,
	[description] [nvarchar](300) NULL,
	[content] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Post]    Script Date: 12/24/2020 17:13:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Post](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[title] [nvarchar](max) NULL,
	[image] [nvarchar](max) NULL,
	[content] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
/****** Object:  Table [dbo].[ViewCount]    Script Date: 12/24/2020 17:13:54 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ViewCount](
	[name] [nvarchar](150) NOT NULL,
	[value] [int] NOT NULL DEFAULT ((0)),
PRIMARY KEY CLUSTERED 
(
	[name] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[Information] ([description], [address], [phone], [email], [openingHours]) VALUES (N'The Sushi Restaurant
', N'New York, NY, USA

', N'12345', N'your-email@your-email.com', N'Monday Closed
<br />
Tuesday 12 - 22
<br />
Wednesday 12 - 22
<br />
Thursday 12 - 22
<br />
Friday 11 - 23
<br />
Saturday 11 - 23
<br />
Sunday 11 - 22')
SET IDENTITY_INSERT [dbo].[Menu] ON 

INSERT [dbo].[Menu] ([id], [name], [price], [description], [content]) 
VALUES (1, 
	N'Menu 1', 
	15, 
	N'Claritas est etiam processus	',
	N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.

')
INSERT [dbo].[Menu] ([id], [name], [price], [description], [content]) 
VALUES (2, 
	N'Menu 2	', 
	20, 
	N'Duis autem vel eum iriure dolor.', 
	N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.

')
INSERT [dbo].[Menu] ([id], [name], [price], [description], [content]) 
VALUES (3, 
	N'Menu 3', 
	25, 
	N'Eodem modo typi, qui nunc nobis videntur.', 
	N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.

')
INSERT [dbo].[Menu] ([id], [name], [price], [description], [content]) 
VALUES (4, 
	N'Menu 4', 
	30, 
	N'Duis autem vel eum iriure dolor.', 
	N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.

')
SET IDENTITY_INSERT [dbo].[Menu] OFF
SET IDENTITY_INSERT [dbo].[Post] ON 

INSERT [dbo].[Post] ([id], [title], [image], [content], [description]) 
VALUES (1, 
	N'24 types of sushi rolls', 

	N'post.jpg', 

	N'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec placerat lacinia magna ut porta. Sed tincidunt ex a vestibulum ultricies. Donec lacinia blandit turpis, in ultrices est volutpat ac. Cras nisl purus, mattis sit amet metus in, convallis pellentesque sapien. Pellentesque aliquet lectus et rhoncus consequat. Suspendisse posuere sollicitudin auctor. Donec lectus purus, tempus non ex non, bibendum ornare velit.
<br /><br />
Phasellus vel ligula ac ligula sodales ornare elementum in odio. Vivamus ex risus, iaculis vitae ex sit amet, fringilla tristique ex. Aliquam ante leo, fringilla vel lectus nec, ornare semper mi. Curabitur congue lacus in magna aliquet consectetur. Sed in ipsum dignissim, maximus metus eu, venenatis justo. Nulla et libero risus. Cras et dictum dolor. Vivamus convallis ultricies neque quis accumsan. Donec eleifend fringilla magna. Integer mattis molestie libero vitae faucibus. Cras ullamcorper vitae est id aliquam. Donec dapibus, sem in efficitur pharetra, nulla velit feugiat nibh, quis egestas diam arcu in eros. Fusce ultrices nunc sit amet diam blandit pellentesque. Pellentesque consectetur nisi nibh, sit amet lacinia arcu fermentum nec. Suspendisse feugiat, velit at varius euismod, nisl turpis vulputate orci, sit amet congue dui turpis nec orci. Vestibulum vel urna eu ex viverra eleifend vel in ligula.
<br /><br />
Cras quis sollicitudin magna, eu interdum ex. Phasellus magna erat, volutpat eu purus id, elementum pulvinar libero. Etiam ac molestie nisl. Mauris tincidunt fringilla nunc id faucibus. Nunc a condimentum quam. Nam ultricies posuere nulla, vel imperdiet ipsum efficitur sit amet. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc pulvinar ac eros eget cursus. Suspendisse sodales elit magna. Donec elementum scelerisque mi, nec venenatis nibh sodales et. Vivamus et feugiat metus. Maecenas tincidunt, dolor quis tincidunt rutrum, mauris mauris congue tellus, sagittis venenatis massa ante ac arcu. In laoreet arcu nec semper gravida. Nullam convallis feugiat dolor sit amet interdum. Proin nec dignissim mi, sed hendrerit libero.
<br /><br />
Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. In vulputate, lorem vitae vestibulum semper, erat dui feugiat ligula, at sollicitudin elit diam ac tellus. Phasellus sit amet eros non ipsum malesuada fringilla. Pellentesque luctus felis a neque lacinia elementum. Vivamus nec tincidunt tellus. Donec vitae ipsum augue. In aliquet pellentesque lobortis. Nunc quis varius tortor. Integer tellus mi, elementum vitae eros nec, ultrices porta erat. Cras placerat id ipsum et iaculis.', 

N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat. Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim placerat facer possim assum.

')
SET IDENTITY_INSERT [dbo].[Post] OFF
INSERT [dbo].[ViewCount] ([name], [value]) VALUES (N'pageView', 1)
