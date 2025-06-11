# userService

**userService** — мікросервіс для управління користувачами у складі масштабованої e-commerce платформи, побудованої за принципами мікросервісної архітектури. Сервіс відповідає за створення, зберігання, оновлення та обробку профілів користувачів, а також за автентифікацію й авторизацію, взаємодіючи з іншими компонентами через REST API.

## Основні функції

- Реєстрація нових користувачів
- Перегляд та редагування інформації про користувача
- Авторизація та автентифікація користувачів (JWT/token)
- Видалення користувачів
- Розмежування ролей (користувач, адміністратор)
- Взаємодія з іншими мікросервісами (orderService, itemService) через REST API
- Підтримка роботи з базою даних (MySQL)
- Документований REST API для інтеграції з фронтендом та іншими сервісами

## Технології

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Spring Security**
- **Spring Web**
- **Spring Validation**
- **Swagger/OpenAPI** (документація)
- **GitHub Actions** (CI/CD)

## Швидкий старт

1. **Клонувати репозиторій:**
   ```bash
   git clone https://github.com/gr-oleg/userService.git
   cd userService
   ```

2. **Налаштувати підключення до MySQL у `application.properties` або `application.yml`:**
   ```
   spring.datasource.url=jdbc:mysql://<host>:<port>/<db_name>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   ```

3. **Запустити застосунок:**
   ```bash
   ./mvnw spring-boot:run
   ```

4. **Переглянути Swagger-документацію:**
   - http://localhost:8080/swagger-ui.html

## Основні REST-ендпоінти

- `GET /user/getAll` — отримати список усіх користувачів ([живий приклад](http://13.51.198.24/user/getAll))
- `GET /user/getById/{id}` — отримати користувача за ідентифікатором
- `POST /user/register` — зареєструвати нового користувача
- `POST /user/login` — авторизувати користувача
- `PUT /user/update/{id}` — оновити інформацію про користувача
- `DELETE /user/delete/{id}` — видалити користувача

### Живий приклад

Сервіс розгорнутий на EC2:

- [http://13.51.198.24/user/getAll](http://13.51.198.24/user/getAll)
