INSERT INTO roles (uid, name, type, enable_boot) VALUES ('53dcd7f9-2f40-499f-a44a-2f4c2d6581e9', 'GROWDEV', 1, true);
INSERT INTO roles (uid, name, type, enable_boot) VALUES ('8901d54d-9ec0-49d6-a959-42d17f961fa4', 'PARCEIRO', 2, true);

INSERT INTO users (uid, email, password, enable_boot, role_uid) VALUES ('6b705ca1-4b63-44b8-832a-606b1676457a', 'admin@email.com', '$2a$12$3dYSlXzFtXTrOfY8aYhU8uDBl5cxTXN6nxzB1wm6qbyOQOTrgY5uS', true, '1');
INSERT INTO users (uid, email, password, enable_boot, role_uid) VALUES ('59af5dfc-1a75-434f-82ba-c3de00993c5d', 'parceiro@email.com', '$2a$12$3dYSlXzFtXTrOfY8aYhU8uDBl5cxTXN6nxzB1wm6qbyOQOTrgY5uS', true, '2');
