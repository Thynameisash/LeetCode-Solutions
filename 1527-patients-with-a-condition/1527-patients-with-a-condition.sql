SELECT * FROM Patients
WHERE conditions LIKE '% DIAB1%'  -- Code starts with DIAB1 and is not the first code
   OR conditions LIKE 'DIAB1%'     -- Code starts with DIAB1 and is the first code
   OR conditions LIKE '% DIAB1'    -- Code starts with DIAB1 and is the last code
   OR conditions = 'DIAB1'