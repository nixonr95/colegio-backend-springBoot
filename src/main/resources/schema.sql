CREATE TABLE colegios
(
id_colegio int not null AUTO_INCREMENT,
name_colegio varchar(255) not null,
primary key(id_colegio) 
);

CREATE TABLE cursos
(
id_curso int not null AUTO_INCREMENT,
salon varchar(255) not null,
grado integer not null,
id_colegio int not null,
FOREIGN KEY (id_colegio) REFERENCES colegios(id_colegio),
primary key(id_curso)
);

CREATE TABLE profesores
(
id_profesor int not null AUTO_INCREMENT,
name_profesor varchar(255) not null,
primary key(id_profesor)
);

CREATE TABLE asignaturas
(
id_asignatura int not null AUTO_INCREMENT,
name_asignatura varchar(255) not null,
id_profesor int not null,
id_curso int not null,
FOREIGN KEY (id_profesor) REFERENCES profesores(id_profesor),
FOREIGN KEY (id_curso) REFERENCES cursos(id_curso),
primary key(id_asignatura)
);

CREATE TABLE estudiantes
(
id_estudiante int not null AUTO_INCREMENT,
name_estudiante varchar(255) not null,
primary key(id_estudiante)
);

CREATE TABLE asignaturas_cursadas
(
id_asignaturas_cursadas int not null AUTO_INCREMENT,
id_asignatura  int not null,
id_estudiante int not null,
FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura) ,
FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante),
primary key(id_asignaturas_cursadas)
);