![Android Build](https://github.com/chaitanya5469/AndroidBuild/actions/workflows/android-build.yml/badge.svg)
# 🤖 Android CI/CD Pipeline with AI-Powered Failure Analysis

> A **fully automated, containerized Android CI/CD pipeline** that builds Android applications using Docker, executes tests via GitHub Actions, and performs **AI-powered failure analysis using Google Gemini** ✨

[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=for-the-badge&logo=github-actions&logoColor=white)](https://github.com/features/actions)
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://www.android.com/)
[![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![AWS](https://img.shields.io/badge/AWS-FF9900?style=for-the-badge&logo=amazonaws&logoColor=white)](https://aws.amazon.com/)

The pipeline exposes build metadata and AI insights via an API, which is consumed by a **separate containerized web dashboard deployed on AWS EC2** 🚀

👉 **Web Dashboard Repository:** https://github.com/chaitanya5469/build-dashboard

---

## 🏗️ System Architecture

```
👨‍💻 Developer Push / PR
        ↓
  ⚡ GitHub Actions
        ↓
🐳 Dockerized Android Build
        ↓
🔨 Gradle Build + Unit Tests
        ↓
📋 Build & Runtime Logs
        ↓
🤖 Gemini AI Failure Analysis
        ↓
📊 Build Metadata + AI Insights (Github API)
        ↓
🌐 Web Dashboard (EC2, Dockerized)
```

---

## ✨ Key Features

- 🐳 Fully **Dockerized Android build environment**
- ⚡ Automated **CI/CD using GitHub Actions**
- 🧪 Unit test execution after build
- 📝 Build and runtime log capture
- 🤖 **AI-based failure explanation and fix suggestions**
- 📊 Exposes structured build data for dashboard consumption
- 💰 Zero paid CI services used

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| 📱 Android | Kotlin, Gradle |
| ⚙️ CI/CD | GitHub Actions |
| 🐳 Containerization | Docker |
| 🤖 AI | Google Gemini API (Free Tier) |
| 🔧 Backend | Node.js / API service |
| ☁️ Hosting | AWS EC2 |
| 🐧 OS | Linux |

---

## 📁 Repository Structure

```
.
├── 📱 app/
│   ├── src/main/           # Android application source
│   ├── src/test/           # Unit tests
│   └── src/androidTest/    # Instrumentation tests
│
├── 🐳 Dockerfile           # Android build container
├── ⚙️ .github/workflows/
│   └── android-build.yml           # GitHub Actions pipeline
│
└── 📖 README.md
```

---

## 🐳 Dockerized Android Build

The Android build runs inside a Docker container to ensure:

✅ Reproducible builds  
✅ Consistent Android SDK versions  
✅ No dependency on local developer environments

### 🚀 Local Build

```bash
docker build -t android-builder .
docker run --rm android-builder
```

---

## 🔄 CI/CD Pipeline Flow

1. 🎯 Triggered on `push` or `pull_request`
2. 🐳 Docker image is built on GitHub Actions runner
3. 🔨 Android app is compiled using Gradle
4. 🧪 Unit tests are executed
5. 📋 Build and test logs are captured
6. 🤖 Logs are sent to Gemini AI on failure
7. 💾 AI response is stored and exposed via API
8. 📦 APK artifacts are uploaded

---

## 🤖 AI Failure Analysis (Gemini)

When a build or test fails:

1. 📋 Gradle logs are extracted
2. 🚀 Logs are sent to Gemini API
3. 🧠 AI returns:
   - 🔍 Root cause
   - 💡 Explanation
   - 🛠️ Suggested fix

**This dramatically reduces debugging time and improves CI feedback quality!** ⚡

---

## 🌐 Deployment

- 🐳 API service is containerized
- ☁️ Deployed on AWS EC2
- 📊 Exposes build history and AI insights to the dashboard

---

## 🔗 Related Repository

**🌐 Web Dashboard (EC2 + Docker):** https://github.com/chaitanya5469/build-dashboard
     Please visit the build-dashboard to [view](https://chaitanyadev.in/) the dashboard
---

## 🎯 Why This Project Matters

- ✅ Demonstrates real-world Android DevOps
- 🤖 Shows LLM integration into CI pipelines
- 🐳 Fully containerized, production-style deployment
- 💰 Built using free-tier infrastructure only

---

## 📄 License

Educational and demonstration use.

---

<div align="center">

**⭐ Star this repo if you find it helpful!**

Made with ❤️ by Chaitanya

</div>
