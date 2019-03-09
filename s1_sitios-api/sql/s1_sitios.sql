delete from TecnologiaEntity;
delete from SitioWebEntity;
delete from DependenciaEntity;
delete from PlataformaDeDespliegueEntity;

insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(100, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadFuncional1','LenguajeDeProgramacion', 'https://images-na.ssl-images-amazon.com/images/I/516GyHY9p6L', '2.0.2');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(200, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadFuncional2','FrameWork', 'https://sitios-web-desarollo.slack.com/messages/CFLUWBKQR/team/UFSKR33CK/', '2.0.3');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(300, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadFuncional3','ServidorDeAplicacion', 'https://stackoverflow.com/questions/30423776/post-to-jersey-rest-service-getting-error-415-unsupported-media-type', '2.0.4');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(400, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadFuncional4','Libreria', 'https://www.youtube.com/watch?v=dQw4w9WgXcQ', '2.0.5');

insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(101, null, 'EntidadNoFuncionalDescripcion','LenguajeDeProgramacion', 'https://images-na.ssl-images-amazon.com/images/I/516GyHY9p6L', '2.0.2');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(201, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalCategoria',null, 'https://sitios-web-desarollo.slack.com/messages/CFLUWBKQR/team/UFSKR33CK/', '2.0.3');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(301, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalUrl','ServidorDeAplicacion', 'EsteNoEsUnLink.EsUnTextoAleatorio', '2.0.4');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(401, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalVersion','Libreria', 'https://www.youtube.com/watch?v=dQw4w9WgXcQ', '2.0.5');

insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(102, 'descripcionInvalida', 'EntidadNoFuncionalDescripcion','LenguajeDeProgramacion', 'https://images-na.ssl-images-amazon.com/images/I/516GyHY9p6L', '2.0.2');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(202, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalCategoria','CategoriaNoFuncional', 'https://sitios-web-desarollo.slack.com/messages/CFLUWBKQR/team/UFSKR33CK/', '2.0.3');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(302, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalUrl','ServidorDeAplicacion', 'EsteNoEsUnLink.EsUnTextoAleatorio', '2.0.4');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(402, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalVersion','Libreria', 'https://www.youtube.com/watch?v=dQw4w9WgXcQ', '2.0.5');

insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(104, 'descripcionInvalida', 'EntidadNoFuncionalDescripcion','LenguajeDeProgramacion', 'https://images-na.ssl-images-amazon.com/images/I/516GyHY9p6L', '2.0.2');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(204, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalCategoria','CategoriaNoFuncional', 'https://sitios-web-desarollo.slack.com/messages/CFLUWBKQR/team/UFSKR33CK/', '2.0.3');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(304, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalUrl','ServidorDeAplicacion', 'EsteNoEsUnLink.EsUnTextoAleatorio', '2.0.4');
insert into TecnologiaEntity (id, description, name, techCategory, url, version)values(404, 'Esta descripcion debe contener mas de 20 caracteres. De lo contrario no es una descripcion valida', 'EntidadNoFuncionalVersion','Libreria', 'https://www.youtube.com/watch?v=dQw4w9WgXcQ', '2.0.5');