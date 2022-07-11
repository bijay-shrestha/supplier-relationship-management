# Implementing an Enterprise Web Application

Assume MIU's local grocery store, the Golden Dome Market (GDM), has hired you to design and develop a Supplier Relationship Management (SRM) system for them, which they will be using to manage the inventory (list) of Products that they stock, along with the various Suppliers who do supply them with the products. They want you to implement a basic web application for this purpose.

Here is the simple solution model for the system:

```
A Product is supplied by a Supplier.
And, a Supplier can supply many Products.
```

Here are the attributes for the 2 entities:

```
Product: productId:long (PK), productNumber:long, name:String, unitPrice:double, quantityInStock:int, dateSupplied:date
```

**Required Product data fields are: productNumber (should be unique), name.**

```
Supplier: supplierId:int (PK), supplierNumber:int,  name:String, contactPhoneNumber:String
```
**Required Supplier data fields are: supplierNumber (should be unique), name.**

For this question, you are expected to do the following:

**1.** Sketch a simple `UML Static (class) model` for the solution.

**2.** Using the tools, technologies and frameworks we have learnt about in this CS425 course, including Spring Web MVC, JPA, etc. (or some other Enterprise Web application development platform/tool(s) of your choice), implement a working web application for GDM. You may use any database of your choice.

You are expected to implement only the following use-cases:

**1.** Display a homepage which presents a set of menu options for Products, Suppliers.

**2.** Display list of Suppliers (Allows the store manager to view a list of all the suppliers in the system)

**3.** Add a new Supplier (Allows the store manager to add a new Supplier into the system)

**4.** Display list of Products (Allows the store manager to view a list of all the products in the system)

**5.** Add a new Product (Allows the store manager to add a new Product into the system)

## My Screenshots

### 1-Welcome Screen
<img width="1512" alt="1-Welcome Screen" src="https://user-images.githubusercontent.com/7867129/178320241-fd7a26c7-76f8-4e37-bb30-2c153801e550.png">

### 2-Supplier List No Record
<img width="1512" alt="2-Supplier List No Record" src="https://user-images.githubusercontent.com/7867129/178320243-22a72213-52d2-4e0b-b5ae-d8251d88fc1c.png">

### 3-Product List No Record
<img width="1512" alt="3-Product LIst No Record" src="https://user-images.githubusercontent.com/7867129/178320247-34010fdb-73ea-4161-924f-29b8987f0e4d.png">

### 4-Add New Supplier
<img width="1512" alt="4-Add New Supplier" src="https://user-images.githubusercontent.com/7867129/178320250-0b0cf3ce-3c8d-436d-b001-6f1641cfaaa4.png">

### 5-Supplier List With Record
<img width="1512" alt="5-Supplier List With Record" src="https://user-images.githubusercontent.com/7867129/178320253-bcd88f3c-f560-4915-86fa-3f23d70d8a49.png">

### 6-Add New Product
<img width="1512" alt="6-Add New Product" src="https://user-images.githubusercontent.com/7867129/178320254-c2bd0be2-af48-4976-bd4f-dc6414b7cbda.png">

### 7-Product List With Record 
<img width="1512" alt="7-Product List With Record" src="https://user-images.githubusercontent.com/7867129/178320258-1b7201eb-eacd-4b1c-a43a-2e02b9a396e3.png">