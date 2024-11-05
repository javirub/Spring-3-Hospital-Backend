# Sistema de Información Hospitalaria (HIS)

## 1. Introducción
Un Sistema de Información Hospitalaria (HIS, por sus siglas en inglés) es un sistema diseñado para gestionar las operaciones y servicios de un centro médico. Este sistema facilita la administración de diferentes aspectos relacionados con la atención médica y la gestión hospitalaria.

### Funcionalidades principales:
- **Gestión de historias clínicas electrónicas**: Permite consultar diagnósticos, tratamientos, y resultados de pruebas médicas.
- **Gestión de pacientes**: Posibilita dar de alta a pacientes, gestionar dietas, seguimiento de la estancia hospitalaria, y administrar tratamientos. TODO
- **Citas médicas**: Permite programar, modificar y cancelar citas médicas.
- **Gestión de recursos hospitalarios**: Administra camas, quirófanos y equipos médicos. TODO
- **Facturación y finanzas**: Maneja seguros de salud, generación de facturas y procesamiento de pagos. TODO

### Roles de usuario
El HIS está diseñado para soportar distintos roles, cada uno con permisos específicos según sus responsabilidades:

- **Administrador**: Acceso completo para la configuración y mantenimiento del sistema.
- **Médico**: Acceso completo a la información clínica de sus propios pacientes.
- **Gestor**: Acceso a métricas y reportes del hospital.

### Usuarios de prueba
Para facilitar el acceso, el sistema viene con usuarios predefinidos:

| Rol          | Usuario       | Contraseña |
|--------------|---------------|------------|
| Administrador| `admin`       | `admin`    |
| Gestor       | `manager`     | `manager`  |
| Médico       | `doctor`      | `doctor`   |

## 2. Endpoints
La aplicación cuenta con una serie de endpoints organizados por funcionalidad. A continuación, se presenta un resumen de los endpoints disponibles, pero se recomienda acceder al swagger para obtener más información, una vez levantada la aplicación puedes acceder desde la url de tu servidor:8051/swagger.html, si estas en local: localhost:8051/swagger.html

### 2.1. Controlador de Usuarios (`user-controller`)
- **PUT** `/user/change_password`: Cambia la contraseña del usuario autenticado.
- **DELETE** `/user/delete`: Elimina el usuario autenticado.

### 2.2. Controlador de Diagnósticos (`diagnosis-controller`)
- **PUT** `/doctors/diagnosis/update/{diagnosisId}`: Actualiza un diagnóstico existente.
- **POST** `/doctors/diagnosis/create`: Crea un nuevo diagnóstico.
- **GET** `/doctors/diagnosis/list/{patientId}`: Lista los diagnósticos de un paciente específico.

### 2.3. Controlador de Citas Médicas para Doctores (`doctor-appointment-controller`)
- **PUT** `/doctors/appointment/confirm/{appointmentId}`: Confirma una cita médica.
- **POST** `/doctors/appointment/create`: Crea una nueva cita médica.
- **GET** `/doctors/appointment/list/{patientId}`: Lista las citas médicas de un paciente específico.

### 2.4. Controlador de Administración (`admin-controller`)
- **PUT** `/backoffice/admin/update/{id}`: Actualiza los datos de un administrador.
- **POST** `/backoffice/admin/register`: Registra un nuevo administrador.
- **GET** `/backoffice/admin/list`: Lista todos los administradores.
- **DELETE** `/backoffice/admin/delete/{id}`: Elimina un administrador.

### 2.5. Controlador de Pacientes (`patients-controller`)
- **GET** `/doctors/patients/list`: Lista todos los pacientes.
- **GET** `/doctors/patients/list/{patientId}`: Obtiene la información de un paciente específico.

### 2.6. Controlador Demográfico (`demographic-controller`)
- **GET** `/backoffice/manager/patients/gender`: Obtiene la distribución de pacientes por género.
- **GET** `/backoffice/manager/patients/diagnosis`: Obtiene la distribución de diagnósticos por tipo.
- **GET** `/backoffice/manager/patients/age`: Obtiene la distribución de pacientes por edad.

### 2.7. Controlador de Citas Médicas para Gestores (`manager-appointment-controller`)
- **GET** `/backoffice/manager/cancelled_appointments_by_doctor`: Obtiene el número de citas canceladas por doctor.
- **GET** `/backoffice/manager/cancelled_appointments_by_age`: Obtiene el número de citas canceladas por grupos de edad.
- **GET** `/backoffice/manager/appointments_by_status`: Obtiene las citas clasificadas por su estado.

## 3. Instalación y Ejecución
Para ejecutar esta aplicación, sigue estos pasos:

1. **Instalar requisitos**:
  - Docker
  - Git
2. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/javirub/Spring-Backend-Hospital.git
3. **Levantar los contenedores**:
  ```bash
  docker-compose up
   
