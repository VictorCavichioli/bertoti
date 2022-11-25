CREATE OR UPDATE TRIGGER departamentoPadrão BEFORE INSERT OR UPDATE
ON FUNCIONARIOS FOR EACH ROW
BEGIN
    IF: new.department == null AND new.department == not in hr.departments then 
        new.department = 20
    END IF;

END;
    