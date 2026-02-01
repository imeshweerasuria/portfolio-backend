package com.adheesha.portfolio.config;

import com.adheesha.portfolio.model.About;
import com.adheesha.portfolio.model.Project;
import com.adheesha.portfolio.model.Skill;
import com.adheesha.portfolio.model.Certification;
import com.adheesha.portfolio.model.Award;
import com.adheesha.portfolio.repository.AboutRepository;
import com.adheesha.portfolio.repository.ProjectRepository;
import com.adheesha.portfolio.repository.SkillRepository;
import com.adheesha.portfolio.repository.CertificationRepository;
import com.adheesha.portfolio.repository.AwardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final AboutRepository aboutRepo;
    private final SkillRepository skillRepo;
    private final ProjectRepository projectRepo;
    private final CertificationRepository certificationRepo;
    private final AwardRepository awardRepo;

    // ✅ helper
    private void seedSkill(String name, String level, String category) {
        if (skillRepo.existsByName(name)) return;

        Skill s = new Skill();
        s.setName(name);
        s.setLevel(level);
        s.setCategory(category);
        skillRepo.save(s);
    }

    @Override
    public void run(String... args) {

        // ... keep your About / Projects / Certifications / Awards same ...

        if (aboutRepo.count() == 0) {
            About about = new About();
            about.setDescription(
                "Passionate software engineering undergraduate with strong Full Stack Development skills."
            );
            about.setRole("Software Engineering Intern");
            aboutRepo.save(about);
        }

        // ✅ seed skills using the helper method (does NOT depend on count == 0)
        seedSkill("Java", "Advanced", "Languages");
        seedSkill("Spring Boot", "Intermediate", "Backend");
        seedSkill("Spring Security", "Intermediate", "Security");
        seedSkill("JPA/Hibernate", "Intermediate", "ORM");
        seedSkill("PostgreSQL", "Intermediate", "Database");
        seedSkill("Docker", "Intermediate", "DevOps");
        seedSkill("WebSocket", "Intermediate", "Real-time");
        seedSkill("REST APIs", "Advanced", "Backend");
        seedSkill("JavaScript", "Advanced", "Frontend");
        seedSkill("TypeScript", "Intermediate", "Frontend");
        seedSkill("React", "Intermediate", "Frontend");
        seedSkill("HTML", "Advanced", "Frontend");
        seedSkill("CSS", "Advanced", "Frontend");
        seedSkill("Leaflet.js", "Intermediate", "Mapping");
        seedSkill("OpenStreetMaps", "Intermediate", "Mapping");
        seedSkill("Chart.js", "Intermediate", "Visualization");
        seedSkill("JWT", "Intermediate", "Security");
        seedSkill("Git", "Advanced", "Tools");
        seedSkill("Maven", "Intermediate", "Tools");
        seedSkill("Node.js", "Intermediate", "Backend");
        seedSkill("Socket.io", "Intermediate", "Real-time");
        seedSkill("OSRM", "Intermediate", "Routing");
        seedSkill("Haversine", "Intermediate", "Algorithms");
        seedSkill("OOP Concepts", "Advanced", "Concepts");

        // ✅ Seed additional skills you requested
        seedSkill("Real-time Systems", "Intermediate", "Architecture");
        seedSkill("Map Visualization", "Intermediate", "GIS");
        seedSkill("Spring Boot Microservices", "Intermediate", "Backend");
        seedSkill("Docker Compose", "Intermediate", "DevOps");
        seedSkill("PostgreSQL Optimization", "Intermediate", "Database");
        seedSkill("React Hooks", "Intermediate", "Frontend");
        seedSkill("TypeScript Interfaces", "Intermediate", "Frontend");
        seedSkill("REST API Design", "Advanced", "Backend");
        seedSkill("WebSocket Implementation", "Intermediate", "Real-time");
        seedSkill("Leaflet Map Layers", "Intermediate", "GIS");
        seedSkill("Chart.js Customization", "Intermediate", "Visualization");
        seedSkill("Spring Security JWT", "Intermediate", "Security");
        seedSkill("JPA Query Optimization", "Intermediate", "ORM");
        seedSkill("Real-time Data Streaming", "Intermediate", "Architecture");
        seedSkill("GIS Data Processing", "Intermediate", "GIS");
        seedSkill("Map Rendering Optimization", "Intermediate", "Visualization");
        seedSkill("OSRM Routing Algorithms", "Intermediate", "Routing");
        seedSkill("Haversine Formula", "Intermediate", "Algorithms");

        if (projectRepo.count() == 0) {

            // 1) Emergency Incident Dispatch
            Project p1 = new Project();
            p1.setOrderIndex(1);
            p1.setTitle("Emergency Incident Dispatch & Operations Management System");
            p1.setStatus("Ongoing");
            p1.setCategory("Enterprise / Mission-Critical");
            p1.setPeriod("Ongoing");
            p1.setDescription("Enterprise-scale, real-time emergency response platform for incident lifecycle management, intelligent dispatching, and live operations.");
            p1.setTechStack("Java, Spring Boot, Spring Security (JWT), PostgreSQL, JPA/Hibernate, REST APIs, WebSockets, Scheduler Jobs, Docker");
            p1.setGithubLink("https://github.com/yourname/emergency-dispatch-system");
            p1.setLiveLink(null);
            p1.setHighlights(String.join("\n",
                    "State-machine workflow: reporting → triage → dispatch → response → resolution → closure",
                    "RBAC authentication with audit trails & activity logging",
                    "Incident module: triage, severity, duplicate detection, approvals, attachments, notes, timeline",
                    "SLA monitoring + automated breach detection + escalations",
                    "GPS-based unit tracking + availability/capacity + capability tagging and Route optimization alongisde Heatmaps",
                    "Distance-aware unit assignment (Haversine) + multi-unit dispatch",
                    "WebSocket live updates: incidents, movements, assignments, alerts",
                    "Operational dashboards: stats, unit distribution, SLA performance, system health"
            ));

            // 2) Smart Waste Platform
            Project p2 = new Project();
            p2.setOrderIndex(2);
            p2.setTitle("Smart Waste Monitoring & Route Optimization Platform");
            p2.setStatus("Ongoing");
            p2.setCategory("Smart City / Optimization");
            p2.setPeriod("Ongoing");
            p2.setDescription("Real-time smart waste management system for IoT-like monitoring, routing optimization, driver workflows, and analytics.");
            p2.setTechStack("Java / Node.js, WebSockets, REST APIs, Leaflet.js, Chart.js, PostgreSQL");
            p2.setGithubLink("https://github.com/yourname/smart-waste-platform");
            p2.setLiveLink(null);
            p2.setHighlights(String.join("\n",
                    "Simulated IoT telemetry: fill levels, overflow alerts, timestamps (no hardware needed)",
                    "Real-time map visualization with urgency indicators via WebSockets",
                    "Route optimization to collect bins above thresholds efficiently",
                    "Interactive maps with Leaflet.js + route visualization",
                    "Driver & fleet workflows: accounts, capacity, assignments, collection status",
                    "Collection history with routes, distances, volumes, completions",
                    "Analytics dashboards: trends, hotspots, driver efficiency, delayed collections",
                    "Extensions: predictive filling, SLA alerts, role-based access control"
            ));

            // 3) Smart Hospital
            Project p3 = new Project();
            p3.setOrderIndex(3);
            p3.setTitle("Smart Hospital Patient Flow & Resource Management System");
            p3.setStatus("Planned / Building");
            p3.setCategory("Healthcare / Systems");
            p3.setPeriod("Planned");
            p3.setDescription("Hospital operations platform for triage-based queues, bed/ward occupancy, doctor assignment, SLA alerts, and patient journey tracking.");
            p3.setTechStack("Java, Spring Boot, PostgreSQL, WebSockets, Analytics Dashboard");
            p3.setGithubLink("https://github.com/yourname/smart-hospital-flow");
            p3.setLiveLink(null);
            p3.setHighlights(String.join("\n",
                    "Triage-based queue prioritization (CRITICAL → HIGH → MEDIUM → LOW) + auto advancement",
                    "Admission & bed management with occupancy tracking + auto allocation/release",
                    "AI-assisted doctor assignment (least-loaded + specialization match)",
                    "Live alerts + SLA escalation for long waiting times",
                    "Analytics dashboard: flow metrics, visit time analytics, occupancy trends + forecasting",
                    "End-to-end patient journey tracking with full audit & movement history"
            ));

            // 4) Royal Bakes
            Project p4 = new Project();
            p4.setOrderIndex(4);
            p4.setTitle("Royal Bakes – Online Delivery & Reservation System");
            p4.setStatus("Completed");
            p4.setCategory("MERN / Real-Time App");
            p4.setPeriod("Aug 2025 – Nov 2025");
            p4.setDescription("MERN platform for online orders, table reservations, delivery ops, real-time tracking, and customer communications.");
            p4.setTechStack("MongoDB, Express.js, React.js, Node.js, Socket.IO, Leaflet.js, REST APIs");
            p4.setGithubLink("https://github.com/yourname/royal-bakes");
            p4.setLiveLink(null);
            p4.setHighlights(String.join("\n",
                    "Online orders + reservations + delivery operations workflows",
                    "Driver assignment with GPS + Haversine distance (manual + auto)",
                    "Live chat (Socket.IO) + map-based tracking (Leaflet + OpenStreetMap)",
                    "Delay detection + automated customer notifications",
                    "Secure role-based access via REST APIs"
            ));

            // 5) OOP/MVC Event Planning
            Project p5 = new Project();
            p5.setOrderIndex(5);
            p5.setTitle("Online Event Planning System");
            p5.setStatus("Completed");
            p5.setCategory("Java MVC / OOP");
            p5.setPeriod("Feb 2025 – May 2025");
            p5.setDescription("MVC-based event management system applying core OOP principles with CRUD operations, dashboards, and persistence.");
            p5.setTechStack("Java, MVC, OOP, JSP, MySQL, JDBC");
            p5.setGithubLink("https://github.com/yourname/online-event-planning");
            p5.setLiveLink(null);
            p5.setHighlights(String.join("\n",
                    "Full CRUD for users and events with JSP UI",
                    "MySQL persistence via JDBC + session management",
                    "Dynamic dashboards + interactive forms",
                    "Structured service layers with OOP best practices"
            ));

            projectRepo.save(p1);
            projectRepo.save(p2);
            projectRepo.save(p3);
            projectRepo.save(p4);
            projectRepo.save(p5);
        }

        if (certificationRepo.count() == 0) {
            Certification c1 = new Certification();
            c1.setOrderIndex(1);
            c1.setTitle("AI/ML Engineer – Stage 1");
            c1.setIssuer("SLIIT");
            c1.setIssueDate("Jan 2026");
            c1.setDescription("AI/ML Stage 1 Certification");
            c1.setCredentialId(null);
            c1.setCredentialUrl(null);

            certificationRepo.save(c1);
        }

        if (awardRepo.count() == 0) {
            Award a1 = new Award();
            a1.setOrderIndex(1);
            a1.setTitle("Content Creator & Educator");
            a1.setOrg("YouTube");
            a1.setNameTag("(Imesh Weerasuria)");
            a1.setDescription("Run a YouTube channel dedicated to teaching current SLIIT modules with a focus on test preparation, sharing knowledge and supporting fellow students.");

            Award a2 = new Award();
            a2.setOrderIndex(2);
            a2.setTitle("Foundations in Microsoft Office Packages");
            a2.setOrg("IDM Nations Campus");
            a2.setNameTag(null);
            a2.setDescription("Completed training in Word, Excel, PowerPoint, and Access, building a strong foundation in productivity tools.");

            Award a3 = new Award();
            a3.setOrderIndex(3);
            a3.setTitle("Senior Prefect");
            a3.setOrg("Local Dhamma School");
            a3.setNameTag(null);
            a3.setDescription("Served as Senior Prefect, demonstrating leadership, discipline, and responsibility in managing student activities and upholding school values.");

            Award a4 = new Award();
            a4.setOrderIndex(4);
            a4.setTitle("Speech & Drama Training");
            a4.setOrg("Wendy Whatmore Academy");
            a4.setNameTag(null);
            a4.setDescription("Engaged in speech and drama activities during childhood, improving public speaking, confidence, and creative expression.");

            awardRepo.save(a1);
            awardRepo.save(a2);
            awardRepo.save(a3);
            awardRepo.save(a4);
        }
    }
}