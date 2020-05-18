CREATE TABLE [dbo].[expensecategories] (
	[catid] int NOT NULL IDENTITY(1,1) PRIMARY KEY CLUSTERED, 
	[catname] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[expenses] (
	[expid] int NOT NULL IDENTITY(1,1) PRIMARY KEY CLUSTERED, 
	[expdate] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS, 
	[expcatid] int, 
	[exptypeid] int, 
	[expamount] float, 
	[expdesc] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS
) ON [PRIMARY]
GO

CREATE TABLE [dbo].[expensetypes] (
	[typeid] int NOT NULL IDENTITY(1,1) PRIMARY KEY CLUSTERED, 
	[typename] varchar(255) COLLATE SQL_Latin1_General_CP1_CI_AS
) ON [PRIMARY]