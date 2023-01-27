--2. "국어국문학과" 에 다니는 여학생 중 현재 휴학중인 여학생을 찾아달라는 요청이
들어왔다. 누구인가? (국문학과의 '학과코드'는 학과 테이블(TB_DEPARTMENT)을 조회해서
찾아 내도록 하자)

SELECT 
    S.STUDENT_NAME
   ,D.DEPARTMENT_NO
   ,D.DEPARTMENT_NAME
  FROM
     TB_DEPARTMENT D
     INNER JOIN  TB_STUDENT S
     ON  D.DEPARTMENT_NO = S.DEPARTMENT_NO
  WHERE 
     S.ABSENCE_YN = 'Y'
     AND
     SUBSTR(STUDENT_SSN,8,'1') = 2
     AND 
     D.DEPARTMENT_
     
;
