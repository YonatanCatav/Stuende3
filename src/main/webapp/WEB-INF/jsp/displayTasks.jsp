<html>
<head>
    <title>get and set properties Example</title>
</head>

<body>
<jsp:useBean id = "Student" class = "task.manager.task.manager.model.Student">
    <jsp:setProperty name = "Student" property = "id" value = "${studentId}"/>
    <jsp:setProperty name = "Student" property = "studentGrades" value = "${studentsGrades}"/>
</jsp:useBean>

<p>Student First Name:
    <jsp:getProperty name = "Student" property = "id"/>
</p>

<p>Student Last Name:
    <jsp:getProperty name = "Student" property = "studentGrades"/>
</p>
</body>
</html>