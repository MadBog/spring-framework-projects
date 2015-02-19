DROP procedure IF EXISTS my_procedure
/;
CREATE procedure my_database_procedure (IN arg int, OUT res int)
BEGIN ATOMIC
	set res = arg + 1;
END
/;