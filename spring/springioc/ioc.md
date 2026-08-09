IoC (Inversion of Control) in Spring means that the framework, not the programmer, controls the creation and management of objects (beans). Instead of using new to instantiate classes, the Spring IoC container injects dependencies automatically, making applications loosely coupled and easier to maintain.

🌱 What is IoC? Definition: Inversion of Control is a design principle where the control of object creation and dependency management is inverted from the programmer to a container or framework.

In Spring: The IoC container (like ApplicationContext) is responsible for instantiating, configuring, and assembling beans based on configuration metadata (XML, annotations, or Java config).

Dependency Injection (DI): A specific form of IoC where dependencies are injected into objects via constructors, setters, or fields.

🛠 How IoC Works in Spring Configuration Metadata

XML (applicationContext.xml)

Annotations (@Component, @Autowired)

Java-based config (@Configuration, @Bean)

IoC Container

BeanFactory: Basic IoC container, lazy initialization.

ApplicationContext: Advanced IoC container, supports AOP, events, internationalization.

Beans

Objects managed by the IoC container.

Defined in configuration and wired together automatically. ⚡ Benefits of IoC Loose Coupling: Objects depend on abstractions, not concrete implementations.

Flexibility: Easy to swap implementations without changing code.

Testability: Dependencies can be mocked or injected easily.

Maintainability: Centralized configuration makes applications easier to manage.

✅ In summary: IoC is the backbone of Spring. It shifts responsibility for object creation from developers to the Spring container, enabling modular, flexible, and testable applications.
