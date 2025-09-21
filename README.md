# Git CI/CD - Code Assist and Code Review

A comprehensive CI/CD repository template that provides automated code assistance and review capabilities through GitHub Actions workflows.

## 🚀 Features

### Code Review Automation
- **Automated Quality Checks**: Super-Linter integration for multi-language code quality analysis
- **Security Scanning**: Trivy vulnerability scanner with SARIF report integration
- **Dependency Analysis**: Automated dependency vulnerability checks for multiple package managers
- **PR Size Validation**: Automatic validation of pull request size to encourage manageable changes
- **Structured PR Templates**: Comprehensive pull request templates for better code reviews

### Code Assistance
- **Multi-Language Support**: Automatic detection and testing for JavaScript, Java, Python, Ruby, Go, Rust, and PHP
- **Dependency Management**: Automated dependency update checks and outdated package detection
- **Code Formatting**: Automatic formatting validation using language-specific tools (Prettier, Black, Google Java Format)
- **Documentation Checks**: Validation of README, CHANGELOG, LICENSE, and CONTRIBUTING files
- **Performance Analysis**: Repository size analysis and binary file detection

### Continuous Integration
- **Multi-Platform Testing**: Cross-platform compatibility testing on Ubuntu, Windows, and macOS
- **Language-Specific Testing**: Tailored testing workflows for each supported language
- **Security Auditing**: Integrated security scanning with Snyk and Bandit
- **Automated Deployment**: Staging and production deployment workflows with proper gating

## 🛠️ Supported Languages and Frameworks

| Language   | Package Manager | Testing Framework | Linting/Formatting |
|------------|-----------------|-------------------|-------------------|
| JavaScript | npm/yarn        | Jest/Mocha        | ESLint + Prettier |
| Java       | Maven/Gradle    | JUnit             | Google Java Format |
| Python     | pip/pipenv      | pytest            | Black + Flake8    |
| Ruby       | Bundler         | RSpec             | RuboCop           |
| Go         | go mod          | go test           | gofmt + golint    |
| Rust       | Cargo           | cargo test        | rustfmt + clippy  |
| PHP        | Composer        | PHPUnit           | PHP-CS-Fixer      |

## 📋 Workflows

### 1. Code Review (`code-review.yml`)
Triggers on every pull request and push to main/develop branches:
- Code quality analysis with Super-Linter
- Security vulnerability scanning with Trivy
- Dependency vulnerability checks
- PR size validation

### 2. Automated Testing (`testing.yml`)
Language-aware testing across multiple versions:
- Automatic language detection
- Multi-version testing matrix
- Framework-specific test execution
- Build verification

### 3. Code Assist (`code-assist.yml`)
Scheduled and on-demand code assistance:
- Weekly dependency update checks
- Code formatting validation
- Documentation completeness checks
- Performance analysis

### 4. CI/CD Pipeline (`ci-cd.yml`)
Full deployment pipeline:
- Multi-platform build verification
- Security auditing
- Staging deployment
- Production deployment with release creation

## 🔧 Setup Instructions

1. **Fork or Use This Template**: Start by forking this repository or using it as a template
2. **Configure Secrets**: Add necessary secrets to your repository:
   - `SNYK_TOKEN`: For Snyk security scanning (optional)
   - Deployment secrets for staging/production environments
3. **Customize Workflows**: Modify the workflows in `.github/workflows/` to match your project needs
4. **Add Project Files**: Add your project files and the workflows will automatically detect the language
5. **Configure Branch Protection**: Set up branch protection rules to require status checks

## 🎯 Quick Start

For a new project:

```bash
# Clone this repository
git clone https://github.com/amitpal83/git-cicd.git my-project
cd my-project

# Add your project files
# The workflows will automatically detect your language and run appropriate checks

# Push to GitHub
git remote set-url origin https://github.com/yourusername/your-repo.git
git push -u origin main
```

## 📖 Pull Request Guidelines

When creating a pull request, please:
- Use the provided PR template
- Keep changes focused and under 500 lines when possible
- Ensure all automated checks pass
- Include appropriate tests for new features
- Update documentation as needed

## 🔒 Security

This repository includes several security features:
- Automated dependency vulnerability scanning
- Secret scanning prevention
- Security-focused code analysis
- SARIF report integration with GitHub Security tab

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Make your changes
4. Ensure all checks pass
5. Submit a pull request using the provided template

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🆘 Support

If you encounter any issues or have questions:
1. Check the [Issues](https://github.com/amitpal83/git-cicd/issues) page
2. Review the workflow logs for detailed error information
3. Create a new issue with detailed information about the problem

## 🔄 Workflow Status

| Workflow | Status |
|----------|--------|
| Code Review | ![Code Review](https://github.com/amitpal83/git-cicd/workflows/Code%20Review%20and%20Quality%20Checks/badge.svg) |
| Testing | ![Testing](https://github.com/amitpal83/git-cicd/workflows/Automated%20Testing/badge.svg) |
| Code Assist | ![Code Assist](https://github.com/amitpal83/git-cicd/workflows/Code%20Assist%20and%20Dependency%20Management/badge.svg) |
| CI/CD | ![CI/CD](https://github.com/amitpal83/git-cicd/workflows/Continuous%20Integration%20and%20Deployment/badge.svg) |